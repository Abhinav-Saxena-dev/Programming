package com.java.Random.immutableObject;

public class test1 {

    public static final class newTest{
        private int b;

        public newTest setB(int b){
            this.b = b;
            return this;
        }

        public test1 build(){
            return new test1(this);
        }
    }


    private final int b;

     public test1(newTest ob){
         this.b = ob.b;
     }

    public int getB() {
        return b;
    }

//    public void setB(int b) {
//        this.b = b;
//    }
}
