package javacourse_interface;

public class lab0121 {

}
interface I4{}
interface I5{}
class A{}
class B{}
class Test1 extends A{}  // Single inheritance
// class Test2 extends A,B{} // Multiple inheritance Never possible in classes
class Test3 implements I4{}
class Test4 implements I4,I5{} // multiple inheritance Interfaces
class Test5 extends A implements I4,I5{}
