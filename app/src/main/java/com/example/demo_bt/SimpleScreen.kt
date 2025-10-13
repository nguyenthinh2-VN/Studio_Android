package com.example.demo_bt // Thay thế bằng package name của bạn

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Đây là một màn hình giao diện đơn giản.
 * Bao gồm một văn bản và một nút bấm.
 * Khi nút được bấm, văn bản sẽ được cập nhật.
 */
@Composable
fun SimpleScreen() {
    // `remember` và `mutableStateOf` được dùng để lưu trạng thái của văn bản.
    var buttonClickCount by remember { mutableStateOf(0) }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            // Căn giữa các thành phần theo cả chiều ngang và chiều dọc.
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Hiển thị văn bản, nội dung sẽ thay đổi khi trạng thái `buttonClickCount` thay đổi.
            Text(
                text = "Bạn đã nhấn nút $buttonClickCount lần.",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(bottom = 24.dp)
            )

            // Nút bấm để người dùng tương tác.
            Button(onClick = {
                // Tăng giá trị của biến trạng thái khi nút được nhấn.
                buttonClickCount++
            }) {
                Text(text = "Nhấn vào đây")
            }
        }
    }
}

/**
 * Hàm Preview này cho phép bạn xem trước giao diện trong Android Studio
 * mà không cần chạy ứng dụng lên thiết bị thật.
 */
@Preview(showBackground = true)
@Composable
fun SimpleScreenPreview() {
    // Bạn nên có một Theme riêng cho ứng dụng, ở đây dùng tạm theme mặc định.
    MaterialTheme {
        SimpleScreen()
    }
}
