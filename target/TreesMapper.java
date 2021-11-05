public class TreesMapper extends Mapper<Object, Text, Text, IntWritable> {
    public int curr_line = 0;
    public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
        if (curr_line != 0) {
            context.write(new Text(value.toString().split(";")[1]), new IntWritable(1));
        }
        curr_line++;
    }
}