# Tài Liệu Tham Khảo Lệnh Docker

Tài liệu này cung cấp tham khảo cho các lệnh Docker phổ biến kèm theo giải thích.

## Kiểm Tra Cài Đặt Docker

```bash
docker --version
```

Hiển thị phiên bản Docker đã cài đặt.

![Kiểm tra phiên bản Docker](images/docker-version.png)

## Các Lệnh Docker Cơ Bản

### Chạy Hello World

```bash
docker run hello-world
```

Xác minh cài đặt Docker bằng cách chạy một container thử nghiệm.

![Chạy hello-world](images/docker-hello-world.png)

### Tải Một Image

```bash
docker pull nginx
```

Tải image nginx từ Docker Hub.

![Tải image nginx](images/docker-pull-nginx.png)

### Liệt Kê Các Image

```bash
docker images
```

Hiển thị tất cả các Docker image được lưu trữ cục bộ.

![Liệt kê các image](images/docker-images.png)

## Quản Lý Container

### Chạy Container ở Chế Độ Nền

```bash
docker run -d nginx
```

Khởi động container nginx trong nền.

![Chạy container nginx](images/docker-run-nginx.png)

### Liệt Kê Các Container Đang Chạy

```bash
docker ps
```

Hiển thị tất cả các container đang chạy.

![Liệt kê container đang chạy](images/docker-ps.png)

### Liệt Kê Tất Cả Các Container

```bash
docker ps -a
```

Hiển thị tất cả các container (đang chạy và đã dừng).

![Liệt kê tất cả container](images/docker-ps-a.png)

### Xem Nhật Ký Container

```bash
docker logs 8f9885a3d376
```

Hiển thị nhật ký từ một container cụ thể.

![Xem nhật ký container](images/docker-logs.png)

### Thực Thi Lệnh Trong Container

```bash
docker exec -it <container_id> /bin/sh
```

Mở một shell tương tác trong container đang chạy.

![Thực thi lệnh trong container](images/docker-exec.png)

### Dừng Container

```bash
docker stop <container_id>
```

Dừng một container đang chạy.

![Dừng container](images/docker-stop.png)

### Khởi Động Lại Container

```bash
docker restart <container_id>
```

Khởi động lại một container.

![Khởi động lại container](images/docker-restart.png)

### Xóa Container

```bash
docker rm <container_id>
```

Xóa một container đã dừng.

![Xóa container](images/docker-rm.png)

### Xóa Tất Cả Các Container Đã Dừng

```bash
docker container prune
```

Xóa tất cả các container đã dừng.

![Xóa container đã dừng](images/docker-container-prune.png)

## Quản Lý Image

### Xóa Một Image

```bash
docker rmi <image_id>
```

Xóa một Docker image.

![Xóa image](images/docker-rmi.png)

### Xóa Tất Cả Các Image Không Sử Dụng

```bash
docker image prune -a
```

Xóa tất cả các image không được sử dụng.

![Xóa image không sử dụng](images/docker-image-prune.png)

## Ánh Xạ Cổng

### Chạy Container Với Ánh Xạ Cổng

```bash
docker run -d -p 8080:80 nginx
```

Chạy nginx với cổng 8080 trên máy chủ được ánh xạ đến cổng 80 trong container.

![Ánh xạ cổng](images/docker-port-mapping.png)

## Kiểm Tra Container

### Kiểm Tra Chi Tiết Container

```bash
docker inspect <container_id>
```

Hiển thị thông tin chi tiết về một container.

![Kiểm tra container](images/docker-inspect.png)

## Quản Lý Volume

### Chạy Container Với Volume

```bash
docker run -d -v mydata:/data nginx
```

Chạy nginx với một volume có tên "mydata" được gắn tại /data.

![Sử dụng volume](images/docker-volume-mount.png)

### Liệt Kê Các Volume

```bash
docker volume ls
```

Hiển thị tất cả các Docker volume.

![Liệt kê volume](images/docker-volume-ls.png)

### Xóa Các Volume Không Sử Dụng

```bash
docker volume prune
```

Xóa tất cả các volume không được sử dụng.

![Xóa volume không sử dụng](images/docker-volume-prune.png)

## Đặt Tên Container

### Chạy Container Với Tên Tùy Chỉnh

```bash
docker run -d --name my_nginx nginx
```

Chạy một container nginx với một tên tùy chỉnh.

![Container với tên tùy chỉnh](images/docker-named-container.png)

## Giám Sát Container

### Hiển Thị Sử Dụng Tài Nguyên Container

```bash
docker stats
```

Hiển thị luồng trực tiếp về thống kê sử dụng tài nguyên của container.

![Thống kê tài nguyên](images/docker-stats.png)

## Quản Lý Mạng

### Liệt Kê Các Mạng

```bash
docker network ls
```

Hiển thị tất cả các mạng Docker.

![Liệt kê mạng](images/docker-network-ls.png)

### Tạo Một Mạng

```bash
docker network create my_network
```

Tạo một mạng Docker mới có tên "my_network".

![Tạo mạng mới](images/docker-network-create.png)

### Chạy Container Trên Một Mạng

```bash
docker run -d --network my_network --name my_container nginx
```

Chạy một container được kết nối với một mạng cụ thể.

![Container trên mạng](images/docker-network-container.png)

### Kết Nối Container Vào Mạng

```bash
docker network connect my_network my_nginx
```

Kết nối một container hiện có với một mạng.

![Kết nối container vào mạng](images/docker-network-connect.png)

## Biến Môi Trường

### Chạy Container Với Biến Môi Trường

```bash
docker run -d -e MY_ENV=hello_world nginx
```

Chạy nginx với một biến môi trường.

![Container với biến môi trường](images/docker-env-var.png)

## Nhật Ký Nâng Cao

### Theo Dõi Nhật Ký Container

```bash
docker logs -f my_nginx
```

Liên tục hiển thị nhật ký mới từ một container.

![Theo dõi nhật ký](images/docker-logs-follow.png)

## Xây Dựng Image Tùy Chỉnh

Để xây dựng một image tùy chỉnh, tạo một Dockerfile:

```dockerfile
FROM nginx
COPY index.html /usr/share/nginx/html/index.html
```

Sau đó xây dựng và chạy image:

```bash
docker build -t my_nginx_image .
docker run -d -p 8080:80 my_nginx_image
```

Điều này xây dựng một image tùy chỉnh dựa trên nginx và chạy nó với ánh xạ cổng.

![Xây dựng và chạy image tùy chỉnh](images/docker-custom-image.png)
