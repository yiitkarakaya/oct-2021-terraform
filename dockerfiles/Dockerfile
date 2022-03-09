# Pulls centos 7 image
FROM  centos:7

# Install telnet
RUN yum install telnet -y

# Set environment variable 
ENV WORDPRESS_DB="wordpress" \
    WORDPRESS_USER="wordpress_user" \
    WORDPRES_HOST="wordpress"   \
    WORDPRES_PASSWORD="wordpress"
LABEL centos="wordpress" \
    created_by="engineers"