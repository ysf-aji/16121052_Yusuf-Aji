// Nama   : Yusuf Aji Wiryanto
// Nim    : 16121052
// MatKul : Pengenalan PBO
// Tugas  : UAS (Membuat pemograman sederhana dengan konsep enkapsulasi)


public class Konsep
{
	public static void main(String args[])
	{
		Universitas univ = new Universitas();
		univ.setProdi("Sistem Informasi");
		univ.setFakultas("Teknologi Informasi");
		univ.setMahasiswa(78);

		System.out.println("Prodi : " + univ.getProdi());
		System.out.println("Fakultas : "+ univ.getFakultas());
		System.out.println("Jml Mahasiswa : " + univ.getMahasiswa());
    }
}