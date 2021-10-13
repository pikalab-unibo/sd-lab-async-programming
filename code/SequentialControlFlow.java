void main(String[] args){
    firstDoThis();   // a, b
    thenDoThis();    // c, d
    finallyDoThis(); // e, f
}

void finallyDoThis() {
    System.out.println("e");
    System.out.println("f");
}

void thenDoThis() {
    System.out.println("c");
    System.out.println("d");
}

void firstDoThis() {
    System.out.println("a");
    System.out.println("b");
}