class Telusko{
    int courseId;
    String courseName;
}
public class LaunchArray5 {
    public static void main(String[]args){
        Telusko []tt=new Telusko[3];

        for(int i=0; i<tt.length;i++){
            tt[i]=new Telusko();

        }
        // tt[0]=new Telusko();
        // tt[1]=new Telusko();
        // tt[2]=new Telusko();
        tt[0].courseId=1;
        tt[0].courseName="nithin";
        tt[1].courseId=2;
        tt[1].courseName="mansha";
        tt[2].courseId=3;
        tt[2].courseName="Lavanya";
        System.out.println(tt[0].courseId);
        System.out.println(tt[0].courseName);

    }

}
