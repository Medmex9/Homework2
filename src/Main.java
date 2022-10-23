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
byte First = 125;
int Second = 33_80;
short Third = 130;
long Fourth = 3532432432444443543L;
float Fifth = 3.6f;
double sixth = 3.789;

// Задание 2 Переменные 2
        float a = 27.12f;
        long b = 987678965549l;
        double c = 2.786;
        boolean d = false;
        char e = 569;
        short q = -159;
        int w = 27897;
        byte r = 67;
// Задание 3
        byte studentsAtLP = 23;
        byte studentsAtAS = 27;
        byte studentsAtEA = 30;
        short Paper = 480;
        int PapersForTheStudent = Paper / (studentsAtLP + studentsAtAS + studentsAtEA);
        System.out.println("На каждого ученика рассчитано" + " "
                + PapersForTheStudent + " " + "листов бумаги");

  // Задание 4
  byte productivityInTwoMinutes = 16;
  int productivityInOneMinute = productivityInTwoMinutes / 2;
  int productivityInTwentyMinutes = productivityInOneMinute * 20;
        System.out.println( "За 20 минут машина произвела"+ " " + productivityInTwentyMinutes
        + " " + "штук");
        int productivityPerDay = productivityInOneMinute * 1440;
        System.out.println("За сутки машина произвела"+" "+ productivityPerDay + " " + "штук");
        int productivityInThreeDays = productivityPerDay * 3;
        System.out.println("За трое суток машина произвела"+" "
                + productivityInThreeDays + " " + "штук");
        int productivityInThirtyDays = productivityPerDay * 30;
        System.out.println("За месяц машина произвела"+" "
                + productivityInThirtyDays + " " + "штук");

// Задание 5
        byte TotalPaint = 120;
       byte OneClassOfWhite = 2;
       byte OneClassOfBrown = 4;
       int PaintsPerClass = OneClassOfWhite + OneClassOfBrown;
       int TotalСlasses = TotalPaint / PaintsPerClass;
       int TotalWhite = TotalСlasses * OneClassOfWhite;
       int TotalBrown = TotalСlasses * OneClassOfBrown;
        System.out.println("В школе, где" + " " + TotalСlasses + " "+
                "классов, нужно" + " " +TotalWhite + " " + "банок белой краски и" + " "
                + TotalBrown + " " + "банок коричневой краски");
 // Задание 6

 byte OneBananas = 80;
 byte OneHundredMlOfMilk = 105;
 byte IceCreamBriquette =  100;
 byte Egg = 70;
 int TotalWeight = (OneBananas * 5) + (OneHundredMlOfMilk * 2)
         + (IceCreamBriquette * 2) + (Egg * 4);
 short gramsPerKilogram = 1000;
 float weightPerKilogram = TotalWeight / (float) gramsPerKilogram;
        System.out.println( " Общий вес блюда" + " " + weightPerKilogram + " " + " килограмм");

 // Задание 7
 byte NeedToReset = 7; // кг
 short GramsPerKilogram = 1000; // грамм
        int NeedToResetGr = NeedToReset * GramsPerKilogram;
 short MinLose = 250;
 short MaxLose = 500;
 float DaysToMinLose = NeedToResetGr / MinLose;
 float DaysToMaxLose = NeedToResetGr / MaxLose;
 float DaysToAveLose = (DaysToMaxLose)% DaysToMinLose;
        System.out.println("Если спортсмен будет худеть по" +" " + MinLose + "грамм, то похудеет на"
                +" " + NeedToReset +" " + " Кг, за" +" " + DaysToMinLose +" дней " + "Если " +
                "спортсмен будет худеть по " + " " + MaxLose + " " + "грамм, то похудеет на"
                +" " + NeedToReset +" " + " Кг, за" +" " + DaysToMaxLose +" "+
                "В среднем спортсмен похудеет на" + NeedToReset + " " +  "кг за" + DaysToAveLose );
int M = 67760;
int D = 84690;
int K = 76230;
double MRaising = M * 0.1f;
double DRaising = D * 0.1f;
double KRaising = K * 0.1f;
// так мы узнаем сколько будет прибавка
        double MWillReceive = M + MRaising;
        double DWillReceive = D + DRaising;
        double KWillReceive = K + KRaising;
int MAnnualIncome = M * 12;
int DAnnualIncome = D * 12;
int KAnnualIncome = K * 12;
// так мы узнаем годовую зп до повышения
        double MAnnualIncomeRaising = MWillReceive * 12;
        double DAnnualIncomeRaising = DWillReceive * 12;
        double KAnnualIncomeRaising = KWillReceive * 12;
        // Так узнаем годовую зп после повышения
        double MAnnualIncomeAfterTheIncrease = MAnnualIncomeRaising - MAnnualIncome;
        double DAnnualIncomeAfterTheIncrease = DAnnualIncomeRaising - DAnnualIncome;
        double KAnnualIncomeAfterTheIncrease = KAnnualIncomeRaising - KAnnualIncome;
        // Так узнаем на сколько вырос годовой доход
        System.out.println( "Маша теперь получает" +" " + MWillReceive +" " + "рублей. " +
                "Годовой доход вырос на" +" " + MAnnualIncomeAfterTheIncrease +" " + "рублей");
        System.out.println( "Денис теперь получает" +" " + DWillReceive +" " + "рублей. " +
                "Годовой доход вырос на" +" " + DAnnualIncomeAfterTheIncrease +" " + "рублей");
        System.out.println( "Кристина теперь получает"+" " + KWillReceive +" " + "рублей. " +
                "Годовой доход вырос на"+" " + KAnnualIncomeAfterTheIncrease +" " + "рублей");













    }}