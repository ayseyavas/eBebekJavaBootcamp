public class Employee {
    String name;
    String surname;
    double salary;
    int workHours;
    int hireYear;
    
Employee(String name,String surname,double salary,int workHours,int hireYear){
this.name=name;
    this.surname=surname;
this.salary=salary;

this.workHours=workHours;
this.hireYear=hireYear;}


double tax(){
    double tax=0.0;
    if(this.salary >= 1000){
        tax=(salary*3)/100;


    }
   else{
       tax=0.0;

    }
return tax;}
double bonus(){
    double bonus;
    if(this.workHours >=40){
        bonus=((workHours-40)*30);
    }
else{
    System.out.println("Calisan bonus almamistir");
    bonus=0.0;

}
return bonus;}
double raiseSalary(){
    double raiseSalary=0.0;
    int year=2021;
    int totalYear;
    totalYear= year-hireYear;
    if(totalYear<10){
        raiseSalary=salary*0.05;
    }
    if(totalYear>9 && totalYear<20){
        raiseSalary=salary*0.1;
    }
if(totalYear>19){
    raiseSalary=salary*0.15;
}
else{
    System.out.println("Calisanin maasi yukselmez");
    raiseSalary=0;
}
return raiseSalary;}

 public String toString(){

     double total = salary -tax() + bonus() + raiseSalary();
     double tot = salary +bonus() - tax();
     System.out.println("Adi : "+this.name);
     System.out.println("Soyadi : "+this.surname);
     System.out.println("Maasi : "+ this.salary);
     System.out.println("Calisma Saati : "+ this.workHours);
     System.out.println("Baslangic Yili : "+this.hireYear);
     System.out.println("Vergi : "+tax());
     System.out.println("Bonus : "+bonus());
     System.out.println("Maas artisi : "+raiseSalary());
     System.out.println("Vergi ve Bonuslar ile birlikte maas : "+tot);
     System.out.println("Toplam Maas : "+total);

 return null;}
}
