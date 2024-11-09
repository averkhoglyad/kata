package ru.yandex;

import java.util.Arrays;
import java.util.Objects;

public class MaxTreePath {

    public int getMaxPath(TreeNode node) {
        if (node == null) {
            return 0;
        }
        var result = doMaxPath(node);
        return Math.max(result.joined(), result.sub());
    }

    private Result doMaxPath(TreeNode node) {
        if (node.left() == null && node.right() == null) {
            return new Result(node.value(), node.value());
        }

        var leftResult = node.left() != null ? doMaxPath(node.left()) : null;
        var rightResult = node.right() != null ? doMaxPath(node.right()) : null ;

        int sub = max(
                leftResult != null ? leftResult.sub() : null,
                rightResult != null ? rightResult.sub() : null
        );

        int joined = max(
                node.value(),
                leftResult != null ? node.value() + leftResult.joined() : null,
                rightResult != null ? node.value() + rightResult.joined() : null
        );

        sub = max(
                joined,
                sub,
                leftResult != null && rightResult != null ? node.value() + leftResult.joined() + rightResult.joined() : null
        );

        if (leftResult != null && rightResult != null) {
            System.out.println(leftResult);
            System.out.println(rightResult);
        }

        return new Result(joined, sub);
    }

    private int max(Integer... values) {
        return Arrays.stream(values)
                .filter(Objects::nonNull)
                .mapToInt(it -> it)
                .max()
                .getAsInt();
    }

    private record Result(int joined, int sub) {
    }

    public record TreeNode(int value, TreeNode left, TreeNode right) {
        public TreeNode(int value) {
            this(value, null, null);
        }
    }
}
