
public class Kingdom {

	public static long getTotalGrains(long k, long grains) {
		if (grains == 0)
			return 0;
		if (k == 1)
			return 1;
		else
			return getTotalGrains(k - 1, grains) * grains;
	}
}
