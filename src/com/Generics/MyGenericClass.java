package com.Generics;

public class MyGenericClass <Thing>{
        private Thing t;
        public MyGenericClass(Thing t) {
            this.t = t;
        }
        public Thing getT() {
            return t;
        }
}
