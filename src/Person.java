//public class Person {
//    private String firstName;
//    private String lastName;
//    private int pesel;
//    private int age;
//
//    public Person(String firstName, String lastName, int pesel, int age){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.pesel = pesel;
//        this.age = age;
//    }
//    public void showInfo(){
//        System.out.println(firstName + " " + lastName + " " + pesel + age);
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public int getPesel() {
//        return pesel;
//    }
//
//    public void setPesel(int pesel) {
//        this.pesel = pesel;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        if (this == object)
//            return true;
//        if (object == null)
//            return false;
//        if (!(object instanceof Object))
//            return false;
//        Object other = (Object) object;
//        if (firstName == null) {
//            if (other.firstName != null)
//                return false;
//        }else if (!firstName.equals(other.firstName))
//            return false;
//        if (lastName != other.lastName)
//            return false;
//
//        if (pesel != other.pesel)
//            return false;
//    }


//}
