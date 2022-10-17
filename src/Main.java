public class Main {
    public static void main(String[] args) {
        // Задание первого блока. Я тобы не плодить цифры комментарии сделал
double dog = 8;
       // dog = dog + 4;
        dog = dog - 3.5;
              System.out.println(dog);
var cat = 3.6;
        cat = cat - 1.6;
       // cat = cat + 4;
        System.out.println(cat);
var paper = 763789;
        paper = paper - 7639;
       // paper = paper + 4;
        System.out.println(paper);
var friend = 19;
        friend = friend * 2;
        friend = friend /3;
        System.out.println(friend);

 var frog = 3.5;
        frog = frog *10;
        frog = frog /3.5;
        frog = frog +4;
        System.out.println(frog);

        // Задание из следующего блока
        double firstBoxer = 78.2;
        double secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("вес первого боксера" +firstBoxer+"кг");
        System.out.println( "вес второго боксера" +secondBoxer+"кг");
        System.out.println("общий вес боксеров" +totalWeight +"кг");
        var overload =  (secondBoxer) %firstBoxer;
        System.out.println("Один боксер весит больше другого на" + " " +overload + " " +"кг");
        var preponderance = secondBoxer - firstBoxer;
        System.out.println("Один боксер весит больше другого на" +""+preponderance + "кг");

        var sharedHours = 640;
        var workingHours = 8;
        var employeesInTheCompany = sharedHours/workingHours;
        System.out.println("Всего работников в компании" + employeesInTheCompany);
        employeesInTheCompany = employeesInTheCompany+94;
        var openingHours = employeesInTheCompany*workingHours;
        System.out.println("Если в компании работает"+" "
                +employeesInTheCompany + " " +"человек, то всего" + " "
                +openingHours + " "+"часов работы может быть поделено между сотрудниками");

// Если я правильно понял задание,
// то нужно узнать общее колличество часов в случае когда увеличивается колличество сотруднков,
// если нет то тогда так
        var workOut = sharedHours / employeesInTheCompany;
        System.out.println("Если в компании работает"+" "
                +employeesInTheCompany + " " +"человек, то всего" + " "
                +workOut + " "+"часов работы может быть поделено между сотрудниками");


}}