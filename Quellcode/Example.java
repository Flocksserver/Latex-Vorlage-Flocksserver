package de.flocksserver;
import org.json.*;

public class A extends AbstractB {

 private void out(HttpServletResponse response) {
  Context context = getContext();
  PrintWriter out = null;
  try {
   out = response.getWriter();
   response.setContentType(
	"application/json;charset=utf-8"
   );
   response.setCharacterEncoding("utf-8");
   JSONObject jsonObj = new JSONObject(context);
   out.print(jsonObj);
   out.flush();
   out.close();
  } catch (IOException e) {
   e.printStackTrace();
  } finally {
   IOUtils.closeQuietly(out);
 }
}
