
package motorph;

/**
 *
 * @author edsamae
 */
public class Employee {
    
        private int employee_id;
        private String name;
        private int age;
        private String gender;
        private String email;
        private String position;
        private String supervisor;
        private byte [] picture;
        
            public Employee(int employee_id, String name, int age, String gender, String email, String position, String supervisor, byte []img) {
                
                this.employee_id = employee_id;
                this.name = name;
                this.age = age;
                this.gender = gender;
                this.email = email;
                this.position = position;
                this.supervisor = supervisor;
                this.picture = img;
            }
            public int getEmployee_Id() {
                return employee_id;
            }
            public String getName(){
                return name;
            }
            public int getAge(){
                return age;
            }
            public String getGender(){
                return gender;
            }
            public String getEmail(){
                return email;
            }
            public String getPosition(){
                return position;
            }
            public String getSupervisor(){
                return supervisor;
            }
            public byte[] getImage(){
                return picture;
            }
        
}
