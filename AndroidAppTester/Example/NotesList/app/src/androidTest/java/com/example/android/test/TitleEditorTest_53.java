package com.example.android.test;
import android.content.Intent;
import android.content.ComponentName;
import android.test.ActivityUnitTestCase;
import android.net.Uri;
import java.net.URI;
import com.example.android.notepad.TitleEditor;
public class TitleEditorTest_53 extends ActivityUnitTestCase<TitleEditor>
{
  public TitleEditorTest_53 ()
  {
    super(TitleEditor.class);
  }
  public void testcase1 ()
  {
    Intent intent = new Intent();
    intent.setClassName("com.example.android.notepad", "com.example.android.notepad.TitleEditor");
    intent.setAction("android.intent.action.MAIN");
    intent.addCategory("android.intent.category.LAUNCHER");
    intent.addCategory("android.intent.category.DEFAULT");
    intent.putExtra("key2", new float[] {
                                          -883.0F,
                                          -764.0F,
                                          137.0F,
                                          13.0F,
                                          145.0F,
                                          728.0F,
                                          92.0F,
                                          -489.0F,
                                          -136.0F,
                                          -967.0F,
                                          -145.0F,
                                          694.0F,
                                          -629.0F,
                                          -634.0F,
                                        });
    try
    {
      intent.putExtra("key1", URI.create("username:password"));
    }
    catch (Throwable t)
    {
    }
    intent.putExtra("key3", new int[] {
                                        -403,
                                        355,
                                        125,
                                        256,
                                        748,
                                        -939,
                                        -659,
                                        740,
                                        909,
                                      });
    startActivity(intent, null, null);
  }
}
 
