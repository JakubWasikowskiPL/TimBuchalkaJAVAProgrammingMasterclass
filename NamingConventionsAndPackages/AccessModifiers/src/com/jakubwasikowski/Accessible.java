package com.jakubwasikowski;
//Challenge:
//In the following interface declaration, what is the visibility of?

//1. the Accessible interface?
//2. the int variable SOME_CONSTANT?
//3. methodA?
//4. methodB and methodC?

//Hint: think back to the lecture on interfaces before answering

//Answers:
//1. It`s  package-private due to no modifier specified , it`s accessible to all classes in the com.jakubwasikowski package
//2. Visibility was set to public, as known from interface lecture all interface variables are public static final
//3. It`s visible everywhere because it`s public
//4. Both methods are public, because all interface methods are automatically public so lack of modifier has no imply package-private
interface Accessible {
    int SOME_CONSTANT=100;
    public void methodA();
    void methodB();
    boolean methodC();
}
