Đây sẽ là file ghi chú học tập luôn
# 1:hello world
-thêm dependency ở file pom.xml để lấy thêm thư viện chạy được code trên web
-sau mỗi lần thay đổi code, khi run java cần restarts để nhận thay đổi
-ở src/main/resources/ có file application.properties, có thể thay đổi cổng chạy thay vì 8080 bằng cách thêm thuộc tính: server.port = [cổng cần thay]
# 2:cấu trúc thư mục
-src: source code
-target: chứa các file java đã được biên dịch cho máy ảo java đọc
-gitignore: các file ngoại lệ không đẩy lên git
-pom.xml: lưu các thông tin của project, tương tự package.json
file pom được maven dùng để xử lý project
# 3:Kiến trúc của spring framework
-Web (mvc)
-ORM (data access)
-Core container:
spring bean: 1 bản sao class được quản lý bởi core container
Với mỗi file .java đã tạo sẽ đóng gói các class nó sử dụng vào 1 bean
Mặc định, component scan sẽ quét các beans nằm ngang hoặc dưới cấp của main
# 4:Spring boot devtools
-nhằm mục đích khi lưu code không cần phải refresh lại project như trong #1
# 5:Setup kết nối mySql
-khi generate project có thể vào start.spring.io để gen ra project và chọn các dependency phù hợp cho nó, còn không thì sẽ làm thủ công như trong commit #5
-Các bước thục hiện bao gồm
    +Cài thêm dependency
    +Cài mysql + tạo schema mới
    +Cấu hình kết nối tới mysql trong file application.propeties
!! 1 lưu ý cho commit này: đổi file propeties sang yml, vì yml có cách viết và trình bày tốt hơn, như bên trong commit có thể thấy các phần đã comment cũ đối với file propeties có nội dung tương tự. Spring có thể nhận diện cả 2 loại file cấu hình này
# 6:Các khái niệm về security
-Authentication: là quá trình định danh, xem 1 user có đúng là được registered trên hệ thống không, cái
-Authorization: xác định cái quyền của 1 thg user khi dùng hệ thống nó được làm gì
-khi cài dependency security, nó sẽ sử dụng 1 cái fillterChain để lọc ra các thông tin của request để xem xét hợp lệ
# 7:Về mô hình MVC
-V: view ở FE, render ra giao diện các thứ
-M: các đối tượng được hệ thống mô hình hóa. Với spring thì nó là table ở DB
-C: nó sẽ sử lý các dữ liệu của model để gửi qua view, trung chuyển dữ liệu
# 8:Annotation của java
-giải thích đơn gian: là 1 cái chú thích của framework, nhưng nó sẽ tăng cường chức năng của 1 class
-ví dụ như trong commmit 7+8 này sẽ có các annotation tường ứng đối với service và conntroller. Khởi tạo userService dùng @sevice, và inject nó vào trong UserController
# 9:view engine:
-nó là giao diện ở BE, (chỉ dùng cái này cho project này thôi, còn thông thường BE sẽ chỉ nhả ra API và kiểm soát với controller các thứ thôi)
-trong file cấu hình yml, có 2 cấu hình vừa thêm cần phải giải thích:
    +prefix: nó sẽ lần giao diện mvc bên trong webapp/[đường dẫn trong cấu hình]
    +suffix: nó sẽ lần theo đuôi file dạng gì để render giao diện
-trong project này sử dụng mvc jsp để render giao diện, tuy nhiên có nhiều công cụ khác có thể xem thêm. Mỗi công cụ sẽ có 1 syntax riêng