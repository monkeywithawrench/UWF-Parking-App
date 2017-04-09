package com.example.cory.myapplication;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.cory.myapplication.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import com.google.maps.android.kml.KmlLayer;
import org.xmlpull.v1.XmlPullParserException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    Button buttonA, buttonB, buttonC, buttonE, buttonF, buttonG,
            buttonH, buttonI, buttonJ, buttonK, buttonL, buttonM,
            buttonO, buttonP, buttonQ, buttonR, buttonS, buttonT,
            buttonU, buttonV, buttonW, buttonX, buttonY, buttonZ;

    Button buttonA2, buttonB2, buttonC2, buttonE2, buttonF2, buttonG2,
            buttonH2, buttonI2, buttonJ2, buttonK2, buttonL2, buttonM2,
            buttonO2, buttonP2, buttonQ2, buttonR2, buttonS2, buttonT2,
            buttonU2, buttonV2, buttonW2, buttonX2, buttonY2, buttonZ2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


/*   buttonA2 = (Button) findViewById(R.id.button25);
    buttonB2 = (Button) findViewById(R.id.button26);
    buttonC2 = (Button) findViewById(R.id.button27);
    buttonE2 = (Button) findViewById(R.id.button28);
    buttonF2 = (Button) findViewById(R.id.button29);
    buttonG2 = (Button) findViewById(R.id.button30);
    buttonH2 = (Button) findViewById(R.id.button31);
    buttonI2 = (Button) findViewById(R.id.button32);
    buttonJ2 = (Button) findViewById(R.id.button33);
    buttonK2 = (Button) findViewById(R.id.button34);
    buttonL2 = (Button) findViewById(R.id.button35);
    buttonM2 = (Button) findViewById(R.id.button36);
    buttonO2 = (Button) findViewById(R.id.button37);
    buttonP2 = (Button) findViewById(R.id.button38);
    buttonQ2 = (Button) findViewById(R.id.button39);
    buttonR2 = (Button) findViewById(R.id.button40);
    buttonS2 = (Button) findViewById(R.id.button41);
    buttonT2 = (Button) findViewById(R.id.button42);
    buttonU2 = (Button) findViewById(R.id.button43);
    buttonV2 = (Button) findViewById(R.id.button44);
    buttonW2 = (Button) findViewById(R.id.button45);
    buttonX2 = (Button) findViewById(R.id.button46);
    buttonY2 = (Button) findViewById(R.id.button47);
    buttonZ2 = (Button) findViewById(R.id.button48);*/
    }
    LatLng UWF = new LatLng(30.547969, -87.217352);
    LatLng Lot_A = new LatLng(30.544987, -87.219775);
    LatLng Lot_B = new LatLng(30.543522, -87.220311);
    LatLng Lot_C = new LatLng(30.543319, -87.221749);
    LatLng Lot_E = new LatLng(30.544668, -87.223117);
    LatLng Lot_F = new LatLng(30.549048, -87.222581);
    LatLng Lot_G = new LatLng(30.550041, -87.221859);
    LatLng Lot_H = new LatLng(30.549267, -87.219987);
    LatLng Lot_I = new LatLng(30.547984, -87.220890);
    LatLng Lot_J = new LatLng(30.546442, -87.219409);
    LatLng Lot_K = new LatLng(30.547699, -87.218057);
    LatLng Lot_L = new LatLng(30.546147, -87.218561);
    LatLng Lot_M = new LatLng(30.545436, -87.215868);
    LatLng Lot_O = new LatLng(30.547090, -87.215353);
    LatLng Lot_P = new LatLng(30.548116, -87.215031);
    LatLng Lot_Q = new LatLng(30.549964, -87.214462);
    LatLng Lot_R = new LatLng(30.550343, -87.215116);
    LatLng Lot_S = new LatLng(30.551811, -87.214926);
    LatLng Lot_T = new LatLng(30.552176, -87.215511);
    LatLng Lot_U = new LatLng(30.553151, -87.216552);
    LatLng Lot_V = new LatLng(30.553133, -87.217915);
    LatLng Lot_W = new LatLng(30.553877, -87.217196);
    LatLng Lot_X = new LatLng(30.554759, -87.217545);
    LatLng Lot_Y = new LatLng(30.546779, -87.213681);
    LatLng Lot_Z = new LatLng(30.545818, -87.213370);

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // mMap.addMarker(new MarkerOptions().position(UWF).title("Marker at UWF"));

        try {
            KmlLayer kmlLayer = new KmlLayer(mMap, R.raw.lots, getApplicationContext());
            KmlLayer kmlLayera = new KmlLayer(mMap, R.raw.lota, getApplicationContext());
            KmlLayer kmlLayerb = new KmlLayer(mMap, R.raw.lotb, getApplicationContext());
            KmlLayer kmlLayerc = new KmlLayer(mMap, R.raw.lotc, getApplicationContext());
            KmlLayer kmlLayere = new KmlLayer(mMap, R.raw.lote, getApplicationContext());
            KmlLayer kmlLayerf = new KmlLayer(mMap, R.raw.lotf, getApplicationContext());
            KmlLayer kmlLayerg = new KmlLayer(mMap, R.raw.lotg, getApplicationContext());
            KmlLayer kmlLayerh = new KmlLayer(mMap, R.raw.loth, getApplicationContext());
            KmlLayer kmlLayeri = new KmlLayer(mMap, R.raw.loti, getApplicationContext());
            KmlLayer kmlLayerj = new KmlLayer(mMap, R.raw.lotj, getApplicationContext());
            KmlLayer kmlLayerk = new KmlLayer(mMap, R.raw.lotk, getApplicationContext());
            KmlLayer kmlLayerl = new KmlLayer(mMap, R.raw.lotl, getApplicationContext());
            KmlLayer kmlLayerm = new KmlLayer(mMap, R.raw.lotm, getApplicationContext());
            KmlLayer kmlLayero = new KmlLayer(mMap, R.raw.loto, getApplicationContext());
            KmlLayer kmlLayerp = new KmlLayer(mMap, R.raw.lotp, getApplicationContext());
            KmlLayer kmlLayerq = new KmlLayer(mMap, R.raw.lotq, getApplicationContext());
            KmlLayer kmlLayerr = new KmlLayer(mMap, R.raw.lotr, getApplicationContext());
            KmlLayer kmlLayers = new KmlLayer(mMap, R.raw.lots, getApplicationContext());
            KmlLayer kmlLayert = new KmlLayer(mMap, R.raw.lott, getApplicationContext());
            KmlLayer kmlLayeru = new KmlLayer(mMap, R.raw.lotu, getApplicationContext());
            KmlLayer kmlLayerv = new KmlLayer(mMap, R.raw.lotv, getApplicationContext());
            KmlLayer kmlLayerw = new KmlLayer(mMap, R.raw.lotw, getApplicationContext());
            KmlLayer kmlLayerx = new KmlLayer(mMap, R.raw.lotx, getApplicationContext());
            KmlLayer kmlLayery = new KmlLayer(mMap, R.raw.loty, getApplicationContext());
            KmlLayer kmlLayerz = new KmlLayer(mMap, R.raw.lotz, getApplicationContext());

            kmlLayer.addLayerToMap();
            kmlLayera.addLayerToMap();
            kmlLayerb.addLayerToMap();
            kmlLayerc.addLayerToMap();
            kmlLayere.addLayerToMap();
            kmlLayerf.addLayerToMap();
            kmlLayerg.addLayerToMap();
            kmlLayerh.addLayerToMap();
            kmlLayeri.addLayerToMap();
            kmlLayerj.addLayerToMap();
            kmlLayerk.addLayerToMap();
            kmlLayerl.addLayerToMap();
            kmlLayerm.addLayerToMap();
            kmlLayero.addLayerToMap();
            kmlLayerp.addLayerToMap();
            kmlLayerq.addLayerToMap();
            kmlLayerr.addLayerToMap();
            kmlLayers.addLayerToMap();
            kmlLayert.addLayerToMap();
            kmlLayeru.addLayerToMap();
            kmlLayerv.addLayerToMap();
            kmlLayerw.addLayerToMap();
            kmlLayerx.addLayerToMap();
            kmlLayery.addLayerToMap();
            kmlLayerz.addLayerToMap();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }

/*      mMap.addMarker(new MarkerOptions().position(Lot_A).title("Lot A"));
        mMap.addMarker(new MarkerOptions().position(Lot_B).title("Lot B"));
        mMap.addMarker(new MarkerOptions().position(Lot_C).title("Lot C"));
        mMap.addMarker(new MarkerOptions().position(Lot_E).title("Lot E"));
        mMap.addMarker(new MarkerOptions().position(Lot_F).title("Lot F"));
        mMap.addMarker(new MarkerOptions().position(Lot_G).title("Lot G"));
        mMap.addMarker(new MarkerOptions().position(Lot_H).title("Lot H"));
        mMap.addMarker(new MarkerOptions().position(Lot_I).title("Lot I"));
        mMap.addMarker(new MarkerOptions().position(Lot_J).title("Lot J"));
        mMap.addMarker(new MarkerOptions().position(Lot_K).title("Lot K"));
        mMap.addMarker(new MarkerOptions().position(Lot_L).title("Lot L"));
        mMap.addMarker(new MarkerOptions().position(Lot_M).title("Lot M"));
        mMap.addMarker(new MarkerOptions().position(Lot_O).title("Lot O"));
        mMap.addMarker(new MarkerOptions().position(Lot_P).title("Lot P"));
        mMap.addMarker(new MarkerOptions().position(Lot_Q).title("Lot Q"));
        mMap.addMarker(new MarkerOptions().position(Lot_R).title("Lot R"));
        mMap.addMarker(new MarkerOptions().position(Lot_S).title("Lot S"));
        mMap.addMarker(new MarkerOptions().position(Lot_T).title("Lot T"));
        mMap.addMarker(new MarkerOptions().position(Lot_U).title("Lot U"));
        mMap.addMarker(new MarkerOptions().position(Lot_V).title("Lot V"));
        mMap.addMarker(new MarkerOptions().position(Lot_W).title("Lot W"));
        mMap.addMarker(new MarkerOptions().position(Lot_X).title("Lot X"));
        mMap.addMarker(new MarkerOptions().position(Lot_Y).title("Lot Y"));
        mMap.addMarker(new MarkerOptions().position(Lot_Z).title("Lot Z"));*/

        mMap.moveCamera(CameraUpdateFactory.newLatLng(UWF));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(UWF, 15));
    }

    public void home() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(UWF, 15));
    }

    public void lotA() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_A, 17));
    }

    public void lotB() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_B, 17));
    }

    public void lotC() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_C, 17));
    }

    public void lotE() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_E, 17));
    }

    public void lotF() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_F, 17));
    }

    public void lotG() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_G, 17));
    }

    public void lotH() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_H, 17));
    }

    public void lotI() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_I, 17));
    }

    public void lotJ() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_J, 17));
    }

    public void lotK() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_K, 17));
    }

    public void lotL() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_L, 17));
    }

    public void lotM() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_M, 17));
    }

    public void lotO() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_O, 17));
    }

    public void lotP() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_P, 17));
    }

    public void lotQ() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_Q, 17));
    }

    public void lotR() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_R, 17));
    }

    public void lotS() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_S, 17));
    }

    public void lotT() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_T, 17));
    }

    public void lotU() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_U, 17));
    }

    public void lotV() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_V, 17));
    }

    public void lotW() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_W, 17));
    }

    public void lotX() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_X, 17));
    }

    public void lotY() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_Y, 17));
    }

    public void lotZ() {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lot_Z, 17));
    }

    protected GoogleMap getMap() {
        return mMap;
    }

}
