import Shape.Point;
import Shape.Triangle;
import Shape.Quadrilateral;
// import Shape.triangle1;
public class App2604 {
    public static void main(String[] args) throws Exception {
        
        Point p = new Point();
        p.nhapDiem();
        p.nhapHoanhDo();
        p.nhapTungDo();
        p.inDiem();
        
        Triangle A = new Triangle();
        Triangle B = new Triangle();
        
        Triangle C = new Triangle();
        A.nhapToaDo();
        A.inToaDo();
        

        B.nhapToaDo();
        B.inToaDo();
        

        C.nhapToaDo();
        C.inToaDo();
        

        Quadrilateral q = new Quadrilateral();
        q.nhapToaDo();
        q.dodaiCanh();
        q.kiemTraTuGiac();
        q.kiemTraLoaiTuGiac();
}

}
