package ch01.ex12;

/**
 *
 * 12.	The	Java	Development	Kit	includes	a	file	src.zip	with	the	source	code	of	the
 * Java	library.	Unzip	and,	with	your	favorite	text	search	tool,	find	usages	of	the
 * labeled	break	and	continue	sequences.	Take	one	and	rewrite	it	without	a	labeled
 * statement.
 *
 *
 * Rewriting java/lang/invoke/Invokers:
 *
 * static MemberName methodHandleInvokeLinkerMethod(String name,
                                                     MethodType mtype,
                                                     Object[] appendixResult).

 Simplyfying return type and parameters with String also where they are local type
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
