import java.util.Objects;
import java.util.StringJoiner;

public class Point3D {
	int x,y,z;
	
	Point3D(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	Point3D() {
		this(0,0,0);
	}
	
	public boolean equals(Object obj) {
		/*
		 * if(Objects.equals(x, ((Point3D)obj).x) && Objects.equals(y, ((Point3D)obj).y)
		 * && Objects.equals(y, ((Point3D)obj).y)) return true; return false;
		 */
		if(obj instanceof Point3D)
		{
			Point3D tmp = (Point3D)obj;
			return (this.x==tmp.x) && (this.y==tmp.y) && (this.z == tmp.z);
		}
		return false;
	}
	
	public String toString() {
		/*
		 * StringJoiner sj = new StringJoiner(",","[","]"); sj.add(""+x); sj.add(""+y);
		 * sj.add(""+z); return sj.toString();
		 */
		return "["+x+","+y+","+z+"]";
	}
}
