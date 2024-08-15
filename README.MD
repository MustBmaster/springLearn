Đây sẽ là file ghi chú học tập luôn
# 1: hello world
-thêm dependency ở file pom.xml để lấy thêm thư viện chạy được code trên web
-sau mỗi lần thay đổi code, khi run java cần restarts để nhận thay đổi
-ở src/main/resources/ có file application.properties, có thể thay đổi cổng chạy thay vì 8080 bằng cách thêm thuộc tính: server.port = [cổng cần thay]
# 2 : cấu trúc thư mục
-src: source code
-target: chứa các file java đã được biên dịch cho máy ảo java đọc
-gitignore: các file ngoại lệ không đẩy lên git
-pom.xml: lưu các thông tin của project, tương tự package.json
file pom được maven dùng để xử lý project
# 3: Kiến trúc của spring framework
-Web (mvc)
-ORM (data access)
-Core container:
spring bean: 1 bản sao class được quản lý bởi core container
Với mỗi file .java đã tạo sẽ đóng gói các class nó sử dụng vào 1 bean
Mặc định, component scan sẽ quét các beans nằm ngang hoặc dưới cấp của main
# 4:Spring boot devtools
-nhằm mục đích khi lưu code không cần phải refresh lại project như trong #1