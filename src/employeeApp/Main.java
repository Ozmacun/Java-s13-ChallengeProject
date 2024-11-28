package employeeApp;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Employee employee = new Employee(2,"Tolga","tlgzmcn@gmail.com","12345", new String[5]);
        employee.addHealthPlan(0,"Tolga");
        System.out.println(employee);
        System.out.println("-------------------------");
        Company company = new Company(3,"Tolga A.Ş",-1,new String[8]);
        company.addEmployee(3,"Leo");
        System.out.println(company);
        System.out.println("-------------------------");
        Healthplan healthplan = new Healthplan(3,"Ahmet", Plan.name );
        System.out.println(healthplan);
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
