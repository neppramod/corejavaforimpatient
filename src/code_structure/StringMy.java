package code_structure;

import java.util.Arrays;

public final class StringMy
    implements java.io.Serializable, Comparable<StringMy>, CharSequence{

    // Used to store character
    private final char value[];

    public StringMy() {
        this.value = new char[]{' '};
    }

    public StringMy(char value[]) {
        this.value = Arrays.copyOf(value, value.length);
    }

    @Override
    public int length() {
        return value.length;
    }


    @Override
    public CharSequence subSequence(int i, int i1) {
        return null;
    }

    @Override
    public int compareTo(StringMy stringMy) {
        return 0;
    }

    private static void checkBounds(byte[] bytes, int offset, int length) {
        if (length < 0)
            throw new StringIndexOutOfBoundsException(length);
        if (offset < 0)
            throw new StringIndexOutOfBoundsException(offset);
        if (offset > bytes.length - length)
            throw  new StringIndexOutOfBoundsException(offset + length);
    }

    public void getChars(int srcBegin, int srcEnd, char dst[], int dstBegin) {
        if (srcBegin < 0) {
            throw new StringIndexOutOfBoundsException(srcBegin);
        }
        if (srcEnd >= value.length) {
            throw new StringIndexOutOfBoundsException(srcEnd);
        }
        if (srcBegin > srcEnd) {
            throw new StringIndexOutOfBoundsException(srcEnd - srcBegin);
        }
        System.arraycopy(value, srcBegin, dst, dstBegin, srcEnd - srcBegin);
    }

    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof StringMy) {
            StringMy anotherString = (StringMy) anObject;
            int n = value.length;
            if (n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return value.length == 0;
    }

    public char charAt(int index) {
        if ((index < 0) || (index >= value.length)) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return value[index];
    }

    public int codePointAt(int index) {
        if ((index < 0) || (index >= value.length)) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return Character.codePointAt(value, index, value.length);
    }
}
