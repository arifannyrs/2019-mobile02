package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	private int number;
	private EditText numperInput;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {

	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		String angka = numberInput.getText().toString();
		int input = Integer.parseInt(angka);

		if(input == number){
			Toast.makeText(this, "Angka Benar!", Toast.LENGTH_SHORT).show();
		}
		else if(input < number ){
			Toast.makeText(this, "Angka Terlalu Kecil!", Toast.LENGTH_SHORT).show();
		}
		else if(input > number){
			Toast.makeText(this, "Angka Tebakan Besar", Toast.LENGTH_SHORT).show();
		}
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
	}
}
