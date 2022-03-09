# Pulls centos 7 image
FROM  farrukhsadykov/webapp:4

# Install telnet
RUN yum install telnet -y && \
    yum install httpd httpd-tools -y  && \
    mkdir -p folder  &&         \
    touch file  && \ 
    yum update -y && \ 
    yum install unzip -y

# Set environment variable 
ENV WORDPRESS_DB="wordpress" \
    WORDPRESS_USER="wordpress_user" \
    WORDPRES_HOST="wordpress"   \
    WORDPRES_PASSWORD="wordpress"

# Set Labels 
LABEL centos="wordpress" \
      created_by="engineers"

# Expose container port 
EXPOSE 80

# Start web server in container
CMD ["/usr/sbin/httpd","-D","FOREGROUND"] 
