package ch01.ex12;

/**
 * Rewriting invoke java/lang/invoke/Invokers:
 *
 * static MemberName methodHandleInvokeLinkerMethod(String name,
                                                     MethodType mtype,
                                                     Object[] appendixResult).

 Simplyfying return type with String and parameters as string where they are local type
 E.g. MethodType

 if/else can be used to simulate switch and break.
 */


public class Solution {
    // static MemberName
    static String methodHandleInvokeLinkerMethod(String name,
                                                 String MethodType_mtype,
                                                 Object[] appendixResult) {

        String which;
        if (name.equals("invokeExact")) {
            which = "MethodTypeForm.LF_EX_LINKER";
        } else if (name.equals("invoke")) {
            which = "MethodTypeForm.LF_GEN_LINKER";
        } else {
            throw new InternalError("not invoker: " + name);
        }

        // Did not continue further because of Local types like LambdaForm

        return "lform.vmetry";
    }
}
