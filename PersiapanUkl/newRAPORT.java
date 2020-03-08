package PersiapanUkl;

import java.util.Scanner;

public class newRAPORT extends home {

    int pilih;
    String namaguru;
    String jawab;

    @Override
    public void menu() {

        String nama[] = new String[5];
        int umur[] = new int[5];
        String kelas[] = new String[5];
        int mtk[] = new int[5];
        int bin[] = new int[5];
        int ipa[] = new int[5];
        int bing[] = new int[5];
        int kim[] = new int[5];
        int rata[] = new int[5];
        Scanner ijup = new Scanner(System.in);

        for (String b = "y"; b.equalsIgnoreCase("y");) {

            System.out.println("====================================");
            System.out.println(" ~Menu :");
            System.out.println("   1. Masukkan Nama");
            System.out.println("   2. Masukkan Nilai");
            System.out.println("   3. Tampilkan Data");
            System.out.println("   3. Keluar");
            System.out.print("   PILIH MENU ~> ");
            pilih = ijup.nextInt();
            System.out.println("====================================");

            switch (pilih) {
                case 1:
                    System.out.println(" >Masukkan Data 3 Siswa :)");
                    System.out.println("====================================");
                    System.out.print("  Nama Guru   : ");
                    namaguru = ijup.next();
                    System.out.println("------------------------------------");
                    for (int a = 1; a <= 3; a++) {
                        System.out.println(" Data ke-" + a);
                        System.out.print("  Nama Siswa : ");
                        nama[a] = ijup.next();
                        System.out.print("  Umur       : ");
                        umur[a] = ijup.nextInt();
                        System.out.print("  Kelas      : ");
                        kelas[a] = ijup.next();
                        System.out.print("  ");
                        System.out.println("------------------------------------");
                    }
                    System.out.print("Kembali Ke Menu (Y/T) : ");
                    b = ijup.next();
                    break;

                case 2:

                    System.out.println("           Input Nilai");
                    System.out.println("====================================");
                    for (int a = 1; a <= 3; a++) {
                        System.out.println(" Data ke-" + a);
                        System.out.println("  Nama Siswa: " + nama[a]);
                        System.out.print("  MTK       : ");
                        mtk[a] = ijup.nextInt();
                        System.out.print("  BIN       : ");
                        bin[a] = ijup.nextInt();
                        System.out.print("  BING      : ");
                        bing[a] = ijup.nextInt();
                        System.out.print("  IPA       : ");
                        ipa[a] = ijup.nextInt();
                        System.out.print("  KIM       : ");
                        kim[a] = ijup.nextInt();
                        System.out.print("  ");
                        System.out.println("------------------------------------");
                    }
                    System.out.print("Kembali Ke Menu (Y/T) : ");
                    b = ijup.next();
                    break;

                case 3:

                    System.out.println("   M E N A M P I L K A N  D A T A");
                    System.out.println("====================================");
                    System.out.println("  ~>Guru : " + namaguru);
                    System.out.println("------------------------------------");
                    for (int a = 1; a <= 3; a++) {
                        System.out.println("Data ke-" + a);
                        System.out.println("    Nama Siswa    : " + nama[a]);
                        System.out.println("    Kode Umur     : " + umur[a]);
                        System.out.println("    Kelas         : " + kelas[a]);
                        rata[a] = (mtk[a] + ipa[a] + bing[a] + bin[a] + kim[a]) / 5;
                        System.out.println("    Rata Rata     : " + rata[a]);
                        if (rata[a] >= 75) {
                            System.out.println("    Keterangan    : Lulus");
                        } else {
                            System.out.println("    Keterangan    : Tidak Lulus");
                        }
                        System.out.println("    #NILAI        : ");
                        System.out.println("    _____________________________");
                        System.out.println("   | Mtk | Bin | Big | Ipa | Kim |");
                        System.out.println("   |-----------------------------|");
                        System.out.println("   | " + mtk[a] + "  | " + bin[a] + "  | " + bing[a] + "  | " + ipa[a] + "  | " + kim[a] + "  |");
                        System.out.println("    -----------------------------");
                        System.out.println("");

                    }
                    System.out.print("Kembali Ke Menu (Y/T) : ");
                    b = ijup.next();
                    break;

                case 4:
                    System.out.print("Anda Ingin Melanjutkan Program (Y/T) : ");
                    b = ijup.next();
                    break;

            }
        }
    }
}
