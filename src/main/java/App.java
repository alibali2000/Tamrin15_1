import Dao.AddressDao;
import Dao.StudentDao;
import Dao.TeacherDao;
import Entities.Address;
import Entities.Student;
import Entities.Teacher;
import Util.JPAUtil;

import javax.persistence.EntityManager;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class App
{
    private static StudentDao studentDao;
    private static TeacherDao teacherDao;
    private static AddressDao addressDao;
    public static void main(String[] args)
    {
        System.out.println();
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        studentDao=new StudentDao(entityManager,Student.class);
        teacherDao=new TeacherDao(entityManager,Teacher.class);
        addressDao=new AddressDao(entityManager,Address.class);


        Teacher teacher1 = new Teacher("sepeher","dehnamaki",12,
                250000.00,LocalDate.of(1999,2,25));
        Teacher teacher2 = new Teacher("her","dnamaki",42,
                250000.00,LocalDate.of(2001,12,5));

        Student student = new Student("alibali","rostamian",1223,
                LocalDate.of(2000,12,3));
        Address address = new Address(10,"semnan","damghan",124,556,
                student,teacher1);



        teacherDao.save(teacher1);
        teacherDao.save(teacher2);


        Set<Teacher> teachers = new HashSet<Teacher>();
        teachers.add(teacher1);
        teachers.add(teacher2);


        student.setStTeachers(teachers);


        studentDao.save(student);
        addressDao.save(address);


        entityManager.getTransaction().commit();
        entityManager.close();
        JPAUtil.shutDown();
    }
}
