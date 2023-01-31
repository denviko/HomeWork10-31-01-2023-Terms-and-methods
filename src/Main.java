public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();

    }
    public static void Task1(){
        System.out.println("Задача №1");
        String firstName="Ivan ";
        String middleName="Ivanovich ";
        String lastName="Ivanov ";
        String fullName= "Ivanov "+"Ivan "+"Ivanovich ";
        System.out.println("ФИО сотрудника — "+(fullName));
    }
    public static void Task2(){
        System.out.println("Задача №2");
        String fullName= "Ivanov "+"Ivan "+"Ivanovich ";
        fullName = "Ivanov "+"Ivan "+"Ivanovich ";
        String capitalLetters = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+(capitalLetters));

    }
    public static void Task3(){
        System.out.println("Задача №3");
        String fullName= "Иванов Семён Семёнович ";
        String replaceLetters = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — "+replaceLetters);
    }

}