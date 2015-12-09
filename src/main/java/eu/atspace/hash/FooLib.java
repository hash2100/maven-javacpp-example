package eu.atspace.hash;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

@Platform(include="foo.h", link="foo")
@Namespace("FooLib")
public class FooLib {
	public static class Foo extends Pointer {
		static { Loader.load(); }

		public Foo() { allocate(); }

		private native void allocate();

		public native void setMethod(int a);
		public native int getMethod();

		public native @Cast("FooLib::Foo::Bool") int getBool();

		public native void getValues(@ByRef Values values);
	}


	public static class Values extends Pointer {
		static { Loader.load(); } 

		public Values() { allocate(); }
		public Values(int size) { allocateArray(size); }

		private native void allocate();
		private native void allocateArray(int size);

		public native float x();
		public native Values x(float x);

		public native float y();
        public native Values y(float x);
	}


	public static void main(String[] args) {
		Foo foo = new Foo();
		System.out.println("initial value: " + foo.getMethod() + " is zero: " + foo.getBool());
		foo.setMethod(5);
		System.out.println("new value: " + foo.getMethod() +  " is zero: " + foo.getBool());
		
		Values v = new Values();
		foo.getValues(v);
		System.out.println("x: " + v.x() + " y: " + v.y());
		
		// close resources
		try {
			foo.close();
			v.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

