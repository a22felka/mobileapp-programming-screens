
**Jag började med att skapa en extra tom activity som jag kallade second activity. 
inom main activity la jag till en knapp som visade andra sidan second activity,

.    protected void onCreate(Bundle savedInstanceState) {
.    super.onCreate(savedInstanceState);
.    setContentView(R.layout.activity_main);
.
.        button = findViewById(R.id.switchActivity);
.        button.setOnClickListener(new View.OnClickListener() {
.            @Override
.            public void onClick(View view) {
.                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
.                intent.putExtra("Pancake type", "folded");
.                intent.putExtra("amount", "8");
.                startActivity(intent);
.            }
.        });
.    }

och jag skapade även lite text i string.xml så att det går att särskillja sidorna från varandra. Jag 
använde sedan intents och extras för att lägga information i main activity och sedan 
skicka och visa upp dem i second activity.

protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_second);
.
.    typ = findViewById(R.id.extraString);
.    mengd = findViewById(R.id.extraString2);
.
.    Bundle extras = getIntent().getExtras();
.    if (extras != null) {
.        pancakeType = extras.getString("Pancake type");
.        pancakeAmount = extras.getString("amount");
.        typ.setText(pancakeType);
.        mengd.setText(pancakeAmount);
.    }
}

Skapade text edits i main activity vars 
input sedan skrivs ut i second activity. Ändrade även på texten i appen så att det 
skulle verka mer som att man handlar pankaror. Slutligen går det även att gå tillbaka 
till första activity från den andra eftersom jag satte main som second activity's 
"parent." Slutligen ändrade jag på storleken och fonten av min text tillsammans med 
små designmodifieringar.**
![img_1.png](img_1.png)
![img_2.png](img_2.png)