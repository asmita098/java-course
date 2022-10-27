<pre style="max-height: 600px;"><code class="java hljs"><span class="hljs-keyword">import</span> java.util.Scanner;

<span class="hljs-keyword">public</span> <span class="hljs-class"><span class="hljs-keyword">class</span> <span class="hljs-title">HelloWorld</span> </span>{

    <span class="hljs-function"><span class="hljs-keyword">public</span> <span class="hljs-keyword">static</span> <span class="hljs-keyword">void</span> <span class="hljs-title">main</span><span class="hljs-params">(String[] args)</span> </span>{

        <span class="hljs-comment">// Creates a reader instance which takes</span>
        <span class="hljs-comment">// input from standard input - keyboard</span>
        Scanner reader = <span class="hljs-keyword">new</span> Scanner(System.in);
        System.out.print(<span class="hljs-string">"Enter a number: "</span>);

        <span class="hljs-comment">// nextInt() reads the next integer from the keyboard</span>
        <span class="hljs-keyword">int</span> number = reader.nextInt();

        <span class="hljs-comment">// println() prints the following line to the output screen</span>
        System.out.println(<span class="hljs-string">"You entered: "</span> + number);
    }
}</code></pre>
