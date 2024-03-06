

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    //Yapıcı metod
    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    //Vergi hesaplaması
    public double tax(){
        if(this.salary < 1000){
            return 0;
        } 
        return (this.salary)*0.03;
    }
    //Bonus hesaplaması
    public int bonus(){
        var extraWorkHours = this.workHours-40;

        if(extraWorkHours <= 0){
            return 0;
        }
        return extraWorkHours * 30;
    }

    //Kıdem yılına göre zam hesaplaması
    public double raiseSalary(){        
        var workYear = 2021 - this.hireYear;

        if( workYear < 10){
          return this.salary*0.05;
        }
        else if(workYear > 9 && workYear < 20){
          return this.salary*0.10; 
        }
        else if(workYear>19){
            return this.salary*0.15;
        }
        return 0;
    }
    //ToString Methodu Overrride edilecek
    @Override
    public String toString() {
        
        
        return "Adı : " + this.name +
               "\nMaaşı : "+ this.salary+
               "\nÇalışma Saati : "+ this.workHours+
               "\nBaşlangıç Yılı : "+ this.hireYear+
               "\nVergi : "+ tax()+
               "\nBonus : "+bonus()+
               "\nMaaş Artışı : "+raiseSalary()+
               "\nVergi ve Bonuslar ile birlikte maaş : " +(this.salary+bonus()-tax())+
               "\nToplam Maaş : " +  (this.salary+bonus()+raiseSalary()-tax());

        
    }
        
}
