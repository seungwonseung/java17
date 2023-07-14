package sec1;

public class Member {
    private String name;
    private String id;
    private String pw;
    private String email;
    private String tel;
    private int point;

    public Member(){this("Shinseungwon")}

    public Member(String name){
        this(name,"seung" );
    }

    public Member(String name, String id){
        this(name,id,"02020202");
    }

    public Member(String name, String id, String pw){
        this(name, id, pw, "sjh8281@naver.com");
    }

    public Member(String name, String id, String pw, String email){
        this(name, id, pw, email, "010-6899-4804");
    }

    public Member(String name, String id, String pw, String email, String tel){
        this(name, id, pw, email, tel, 100);
    }

    public Member(String name, String id, String pw, String email, String tel, int point) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.email = email;
        this.tel = tel;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
