public class User {
    private int id;
    private String Fname;
    private String Lname;
    private int age;
    private String e_mail;
    private Education education;

    public static UserGenaration builder() {
        return new UserGenaration();
    }

    static class UserGenaration {

        User user = new User();

        public UserGenaration id(Integer id) {
            user.id = id;
            return this;
        }

        public UserGenaration Fname(String Fname) {
            user.Fname = Fname;
            return this;
        }

        public UserGenaration Lname(String Lname) {
            user.Lname = Lname;
            return this;
        }

        public UserGenaration age(Integer age) {
            user.age = age;
            return this;
        }

        public UserGenaration e_mail(String e_mail) {
            user.e_mail = e_mail;
            return this;
        }

        public UserGenaration education(Education education) {
            user.education = education;
            return this;
        }

        public User build() {
            return user;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", age=" + age +
                ", e_mail='" + e_mail + '\'' +
                ", education=" + education +
                '}';
    }
}
