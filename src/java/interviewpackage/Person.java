package interviewpackage;

import java.io.Serializable;
import java.util.Scanner;
  public  class Person implements Serializable {
        public static final long serialVersionUID = 1;
         String name, address;
        int age;

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

//asking the detail from user
      //  public Person(){
//            Scanner s=new Scanner(System.in);
//            System.out.println("Name,Address,Mobileno,Age");
//            System.out.println("name");
//            name=s.nextLine();
//            System.out.println("address");
//            address=s.nextLine();
//            System.out.println("age");
//            age=Integer.parseInt(s.nextLine());
//        }

      @Override
      public String toString() {
          return "Person{" +
                  "name='" + name + '\'' +
                  ", address='" + address + '\'' +
                  ", age=" + age +
                  '}';
      }

        public static void main(String args[]){
            //Person p= new Person();
           // System.out.println(p);

        }
    }

