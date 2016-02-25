package com.example.android.test;
import android.content.Intent;
import android.content.ComponentName;
import android.test.ActivityUnitTestCase;
import android.net.Uri;
import java.net.URI;
import com.example.android.notepad.NotesList;
public class NotesListTest_7 extends ActivityUnitTestCase<NotesList>
{
  public NotesListTest_7 ()
  {
    super(NotesList.class);
  }
  public void testcase1 ()
  {
    Intent intent = new Intent();
    intent.setClassName("com.example.android.notepad", "com.example.android.notepad.NotesList");
    intent.setAction("android.intent.action.MAIN");
    intent.addCategory("android.intent.category.LAUNCHER");
    intent.putExtra("key3", new float[] {
                                          34.0F,
                                          39.0F,
                                          -146.0F,
                                          -501.0F,
                                          226.0F,
                                          -72.0F,
                                          -787.0F,
                                          285.0F,
                                          100.0F,
                                          -360.0F,
                                          -854.0F,
                                        });
    intent.putExtra("key1", new int[] {
                                        -336,
                                        178,
                                        -233,
                                        -399,
                                        -162,
                                        115,
                                        -218,
                                        31,
                                        103,
                                        156,
                                      });
    intent.putExtra("key2", -247);
    try
    {
      intent.setData(Uri.parse("tel:123"));
    }
    catch (Throwable t)
    {
    }
    startActivity(intent, null, null);
  }
}
 
