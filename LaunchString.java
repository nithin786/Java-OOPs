class Telusko{
    int courseId;
    String CourseName ="AWS";
    @Override
    public String toString() {
        return "Telusko [courseId=" + courseId + ", CourseName=" + CourseName + "]";
    }
}
public class LaunchString {
    public static void main(String[]args){
        Telusko tt= new Telusko();
        System.out.println(tt);
    }

}
