package com.midoctor.proyectdoc2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class ClinicasActivity extends Activity {
	
	
	int[] imageId= {
			R.drawable.botonpediatriccenter,
		};
	String[] title= {
			"Pediatric Center",
		};
	String[] website= {
			"www.pediatric-center.com.mx/",
		};
	String[] direccion= {
			"21.1362757,-86.829636",
		};
	String[] correo= {
			"contacto@pediatric-center.com.mx",
		};
	String[] telefono= {
			"(998) 844 77 11",
		};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clinicas);
		GridView grid = (GridView) findViewById(R.id.grid_clinicas);
		CustomGrid adapter = new CustomGrid(getApplicationContext(),imageId);
		grid.setAdapter(adapter);
		grid.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				Intent detailIntent = new Intent(getApplicationContext(), DetalleClinica.class);
				detailIntent.putExtra("id", "1");
				detailIntent.putExtra("Nombre", title[position]);
				detailIntent.putExtra("website", website[position]);
				detailIntent.putExtra("direccion", direccion[position]);
				detailIntent.putExtra("correo", correo[position]);
				detailIntent.putExtra("telefono", telefono[position]);
				detailIntent.putExtra("code", "clinicas");
				
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
		getMenuInflater().inflate(R.menu.clinicas, menu);
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
