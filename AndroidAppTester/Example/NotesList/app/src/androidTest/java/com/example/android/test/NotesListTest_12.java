package com.example.android.test;
import android.content.Intent;
import android.content.ComponentName;
import android.test.ActivityUnitTestCase;
import android.net.Uri;
import java.net.URI;
import com.example.android.notepad.NotesList;
public class NotesListTest_12 extends ActivityUnitTestCase<NotesList>
{
  public NotesListTest_12 ()
  {
    super(NotesList.class);
  }
  public void testcase1 ()
  {
    Intent intent = new Intent();
    intent.setClassName("com.example.android.notepad", "com.example.android.notepad.NotesList");
    intent.setAction("android.intent.action.VIEW");
    intent.addCategory("android.intent.category.LAUNCHER");
    try
    {
      intent.setData(Uri.parse("content://contacts/people/1"));
    }
    catch (Throwable t)
    {
    }
    intent.setType("R_v");
    intent.putExtra("mX3T4e3U9RMI22S", "it is string value1");
    intent.putExtra("skga6umHxvW90", false);
    intent.putExtra("IrGaE3vlS94i", 723);
    try
    {
      intent.putExtra("KxsdoNKC", URI.create("fragment"));
    }
    catch (Throwable t)
    {
    }
    intent.putExtra("ebqqbMrO1o1", true);
    try
    {
      intent.putExtra("A0", URI.create("Ys04X"));
    }
    catch (Throwable t)
    {
    }
    try
    {
      intent.putExtra("MLsaa", URI.create("wg6D9:qHJ9vMNTr"));
    }
    catch (Throwable t)
    {
    }
    try
    {
      intent.putExtra("4Ha5PmlD", URI.create("HXyzkHm5k4vZ_"));
    }
    catch (Throwable t)
    {
    }
    intent.putExtra("88sjbvMy8eB8ruQ", "it is string value1");
    intent.putExtra("AWPE7fJ", 100.0F);
    intent.putExtra("WuqxqcckNUk7jG", "it is string value4");
    intent.putExtra("CGb8Ne", "it is string value2");
    startActivity(intent, null, null);
  }
}
 
