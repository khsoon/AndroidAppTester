package com.example.android.test;
import android.content.Intent;
import android.content.ComponentName;
import android.test.ActivityUnitTestCase;
import android.net.Uri;
import java.net.URI;
import com.example.android.notepad.NotesLiveFolder;
public class NotesLiveFolderTest_56 extends ActivityUnitTestCase<NotesLiveFolder>
{
  public NotesLiveFolderTest_56 ()
  {
    super(NotesLiveFolder.class);
  }
  public void testcase1 ()
  {
    Intent intent = new Intent();
    intent.setClassName("com.example.android.notepad", "com.example.android.notepad.NotesLiveFolder");
    intent.setAction("android.intent.action.MAIN");
    intent.addCategory("android.intent.category.LAUNCHER");
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
 
