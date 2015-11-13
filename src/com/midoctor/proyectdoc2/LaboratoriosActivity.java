package com.midoctor.proyectdoc2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.AdapterView.OnItemClickListener;


public class LaboratoriosActivity extends Activity {

	int[] imageId= {
			R.drawable.botonlaboratoriostorre,
		};
	String[] title= {
			"Laboratorios Torre",
		};
	String[] website= {
			"www.laboratoriostorre.com",
		};
	String[] direccion= {
			"21.1465676,-86.8513393",
		};
	String[] correo= {
			"info@laboratoriostorre.com",
		};
	String[] telefono= {
			"(998) 155 80 03",
		};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_laboratorios);
		GridView grid = (GridView) findViewById(R.id.grid_laboratorios);
		CustomGrid adapter = new CustomGrid(getApplicationContext(),imageId);
		grid.setAdapter(adapter);
		grid.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				Intent detailIntent = new Intent(getApplicationContext(), DetalleLaboratorioActivity.class);
				detailIntent.putExtra("id", "1");
				detailIntent.putExtra("Nombre", title[position]);
				detailIntent.putExtra("website", website[position]);
				detailIntent.putExtra("direccion", direccion[position]);
				detailIntent.putExtra("correo", correo[position]);
				detailIntent.putExtra("telefono", telefono[position]);
				detailIntent.putExtra("code", "laboratorios");
				
				startActivity(detailIntent);
			/*	Intent detailIntent = new Intent(getApplicationContext(), EcardDetailActivity.class);
				detailIntent.putExtra("title", ecardItem[position]);
				detailIntent.putExtra("imageId", imageBigid[position]);
				detailIntent.putExtra("position", position);
				startActivity(detailIntent);*/
				
			}

			
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.laboratorios, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
