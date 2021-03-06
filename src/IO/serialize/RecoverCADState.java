package IO.serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * Created by H.J
 * 2018/5/19
 */
public class RecoverCADState {
    @SuppressWarnings("unchecked")
    public static void main(String args[]) throws Exception{
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("CADState.out")
        );
        List<Class<? extends Shape>> shapeTypes = (List<Class<? extends Shape>>) in.readObject();
        Line.deserializeStaticState(in);
        List<Shape> shapes = (List<Shape>) in.readObject();
        System.out.println(shapes);
    }
}
