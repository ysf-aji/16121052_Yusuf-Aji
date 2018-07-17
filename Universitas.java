// Nama   : Yusuf Aji Wiryanto
// Nim    : 16121052
// MatKul : Pengenalan PBO
// Tugas  : UAS (Membuat pemograman sederhana dengan konsep enkapsulasi)


public class Universitas
{

	private String Prodi;
	private String Fakultas;
	private int Mahasiswa;

	public String getProdi()
	{
		return Prodi;
	}

	public String getFakultas()
	{
		return Fakultas;
	}

	public int getMahasiswa()
	{
		return Mahasiswa;
	}


	public void setProdi(String newProdi)
	{
		Prodi = newProdi;
	}

	public void setFakultas( String newId)
	{
		Fakultas = newId;
	}
	
	public void setMahasiswa( int newMahasiswa)
	{
		Mahasiswa = newMahasiswa;
	}
}