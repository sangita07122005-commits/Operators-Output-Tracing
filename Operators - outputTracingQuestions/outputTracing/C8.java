package outputTracing;

public class C8 {
    public static void main(String[] args) {

        boolean z = !(5 != 5) && (3 < 4 || 7 >= 8) ^ true;
        System.out.println("z = " + z);


        int aa = (100 >> 3) << 4 >> 2;
        System.out.println("aa = " + aa);


        int bb = (15 & 22) ^ (14 | 25);
        System.out.println("bb = " + bb);


        int cc = 3;
        cc = cc++ - --cc + ++cc - cc--;
        System.out.println("cc = " + cc);


        int dd = (50 >>> 2) + (30 << 1) - (15 >> 1);
        System.out.println("dd = " + dd);


        int ee = 4;
        ee = ++ee * (ee++ + --ee) - ee--;
        System.out.println("ee = " + ee);
    }
}

/*
OUTPUT

z = false
aa = 48
bb = 25
cc = 0
dd = 65
ee = 45

 */