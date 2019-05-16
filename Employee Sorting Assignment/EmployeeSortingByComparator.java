import java.util.Scanner;
import java.util.ArrayList;
class EmployeeSortingByComparator{
  static ArrayList list = new ArrayList();
  static  Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
            
            EmployeeSortingByComparator ec = new EmployeeSortingByComparator();
                   ec.empSorting();
                   
do{
    System.out.println("Do you want to add more Employee Details (y/n):");
            String agree = sc.next();
            if(agree.equalsIgnoreCase("y")){
                ec.empSorting();
            
            }
            else if(agree.equalsIgnoreCase("n")){
                ec.sortEmp();

            }
            else{
                System.out.println("Enter yes or No");
            }

} while(list != null);
            
     }

        public void empSorting(){
            System.out.println("_________________________________________");
            System.out.println("Enter Employee Details :");
            System.out.println("ID :");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Name :");
            String name = sc.nextLine();
            System.out.println("Age :");
            int  age = sc.nextInt();
            sc.nextLine();
            System.out.println("Address :");
            String address = sc.nextLine();
            list.add(new Employee(id,name,age,address));
            System.out.println(list);
        }


        public void sortEmp(){

            System.out.println("Sort By :");
                System.out.println("1.ID :");
                System.out.println("2.Age :");
                System.out.println("3.Address:");
                System.out.println("4.First Name :");
                System.out.println("5.Last Name :");
                System.out.println("6.EXit");
                int number = sc.nextInt();
                     switch(number){
                            case(1):
                            java.util.Collections.sort(list, new SortByID());
                            System.out.println("Contents of list after sorting : " + list);
                            break;
                            case(2):
                            java.util.Collections.sort(list, new SortByAge());
                            System.out.println("Contents of list after sorting : " + list);
                            break;
                            case(3):
                            java.util.Collections.sort(list, new SortByAddress());
                            System.out.println("Contents of list after sorting : " + list);
                            break;
                            case(4):
                            java.util.Collections.sort(list, new SortByFirstName());
                            System.out.println("Contents of list after sorting : " + list);
                            break;
                            case(5):
                            java.util.Collections.sort(list, new SortByLastName());
                            System.out.println("Contents of list after sorting : " + list);
                            break;
                            case(6):
                            int flag = 1;

                           default:
                           System.out.println("Please enter Appropriate values");
                        
        }

        
     }       
   
    }

    
         

 
class Employee{
    private Integer age,id;
    private String address, name,firstName,lastName;
    private  String [] nameArr;
 
    Employee(Integer id,String name,Integer age, String address){
        this.id=id;
        this.name = name;
        this.age = age;
        this.address = address;
        nameArr = name.split(" ");
        firstName = nameArr[0];
        lastName = nameArr[1];
        
    }
 
    @Override
    public String toString(){
        return "Employee ID: " + this.id + ",With FirstName : " + this.firstName + ",With LastName : " + this.lastName + ", Of Age : " + this.age + ", And His Address is : " + this.address;
    }
 
    //Getters
    public Integer getId(){
        return this.id;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
 
    public String getAddress(){
        return this.address;
    }
    
    public Integer getAge(){
        return this.age;
    }
    
    
}

class SortByFirstName implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
    return ((Employee)firstObject).getFirstName().compareTo(((Employee)secondObject).getFirstName());
    
    }
}
class SortByLastName implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
    return ((Employee)firstObject).getLastName().compareTo(((Employee)secondObject).getLastName());
    
    }
}
 
//Sorting on the basis of ID
class SortByID implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
return ((Employee)firstObject).getId().compareTo(((Employee)secondObject).getId());   
    }
}
 
//Sorting on Brand
class SortByAddress implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
return ((Employee)firstObject).getAddress().compareTo(((Employee)secondObject).getAddress()); 
    }
}

//sort by Age
    
class SortByAge implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
return ((Employee)firstObject).getAge().compareTo(((Employee)secondObject).getAge()); 
    }
}
 
 