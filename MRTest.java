import java.io.File;
import java.util.HashMap;
import java.util.List;

public class MRTest extends mapreduce.Mapper<String, Integer, Integer> {

	public MRTest() {
	}

	public HashMap<String, Integer> map(File resource) {
		emit("resource", 2);
		emit("dog", 5);
		emit("hair", 1);
		try { Thread.sleep(5000); } catch (Exception e) {}
		return null;
	}

	public Integer reduce(String key, List<Integer> listOfValues) {
		int count = 0;
		for (Integer val : listOfValues)
			count += val;
		return count;
	}
}
