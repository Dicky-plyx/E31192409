import java.util.*;
/**
 *
 * @author Hp
 */
public class QueueImp {
    public static void main(String[] args) {
        //menginisialisasi / menamakan interface queue menggunakan object linked list
        Queue<String> antrianSem = new LinkedList();
        
        //menambahkan data atau nilai element baru ke list queue (Enqueue)
        antrianSem.add("Dicky Gunawan");
        antrianSem.add("Alvino Kharisma");
        antrianSem.add("Junio Ajuma");
        antrianSem.add("Sueb Saeri");
        antrianSem.add("Wempy Zalza");
        
        //menampilkan output hasil list
        System.out.println("Antrian pemberian sembako anak duafa : "+antrianSem);
        
        //menghapus element daru queue menggunakan operasi dequeue
        String nama = antrianSem.remove();
        System.out.println("Menghapus Antrian : "+nama+"| Antrian Baru : "+antrianSem);
        
        //menghapus element dengan method poll()
        nama = antrianSem.poll();
        System.out.println("Menghapus Antrian : "+nama+"| Antrian Baru : "+antrianSem);
        
    }
}
