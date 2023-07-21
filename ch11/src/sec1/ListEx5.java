package sec1;

import java.util.List;
import java.util.Vector;


class Qna{
    public int qno;
    public String title;
    public String content;
    public Qna() {}
    public Qna(int qno, String title, String content){
        this.qno = qno;
        this.title = title;
        this.content = content;
    }
}

public class ListEx5 {
    public static void main(String[] args) {
        List<Qna> q = new Vector<>();
        Qna a = new Qna(1, "제목1", "신승원");
        q.add(a);
        q.add(new Qna(1, "제목1", "신승원"));
        q.add(new Qna(1, "제목1", "신승원"));
        q.add(new Qna(1, "제목1", "신승원"));
        System.out.println("글번호\t제목\t내용");
        for(Qna p:q){
            System.out.println(p.qno+"\t"+p.title+"\t"+p.content);
        }

    }
}
